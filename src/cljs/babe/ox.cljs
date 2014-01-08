(ns babe.ox)

;; 'js-log' is a direct wrapper around console.log.  You can call it directly if
;; you want exactly console.log's semantics from ClojureScript including
;; e.g. inline expansion of javascript objects.
(def js-log (.bind (.-log js/console) js/console))

;; 'log' is a suped up version that automatically pretty prints clojure data
;; structures.  You can squeeze :raw in as the first argument to quickly
;; disable pretty printing in case of an emergency.
(defn log [msg & args]
  (let [args (vec args)]
    (apply js-log (if (= :raw msg)
                    args
                    (cons msg (map pr-str args))))))
