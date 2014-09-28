(ns express-spike.core
  (:require [cljs.nodejs :as nodejs]) )

(defn main [& args]
  (println "hello node") )

(nodejs/enable-util-print!)
(set! *main-cli-fn* main)

