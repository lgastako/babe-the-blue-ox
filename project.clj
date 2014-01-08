(defproject babe-the-blue-ox "0.1.0-SNAPSHOT"
  :description "only the highest quality logging for this ox."
  :url "http://github.com/lgastako/babe-the-blue-ox"
  :plugins [[lein-cljsbuild "1.0.1"]]
  :hooks [leiningen.cljsbuild]
  :source-paths ["src/cljs"]
  :cljsbuild {:builds [{:source-paths ["src/cljs"]
                        :compiler {:optimizations :whitespace
                                   :pretty-print true}}]}
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2138"]])
