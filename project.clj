(defproject babe-the-blue-ox "0.2.0-SNAPSHOT"
  :description "only the finest blend of logging for this ox."
  :url "http://github.com/lgastako/babe-the-blue-ox"
  :plugins [[lein-cljsbuild "1.0.1"]
            [com.keminglabs/cljx "0.3.2"]]
  :hooks [leiningen.cljsbuild
          cljx.hooks]
  :source-paths ["src/cljx"
                 "src/clj"
                 "src/cljs"
                 "target/generated/clj"
                 "target/generated/cljs"]
  :cljx {:builds [{:source-paths ["src/cljx"]
                   :output-path "target/classes"
                   :rules :clj}
                  {:source-paths ["src/cljx"]
                   :output-path "target/classes"
                   :rules :cljs}]}
  :cljsbuild {:builds [{:source-paths ["target/classes"]
                        :compiler {:optimizations :whitespace
                                   :pretty-print true}}]}
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2138"]])
