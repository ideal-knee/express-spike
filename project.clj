(defproject express-spike "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html" }

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2356"] ]
  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-npm "0.4.0"] ]
  :source-paths []

  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler {:target :nodejs
                                   :output-to "resources/express-spike.js"
                                   :optimizations :simple
                                   :pretty-print true } }]}

  :main "resources/express-spike.js"
  :node-dependencies [[express "4.9.5"]] )

