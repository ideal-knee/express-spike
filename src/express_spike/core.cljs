(ns express-spike.core
  (:require [cljs.nodejs :as nodejs]) )

(def app ((nodejs/require "express")))
(def server (atom nil))

(.get app "/hello" (fn [request response]
                     (.send response "Hello world!") ))

(defn main [& args]
  (reset! server (.listen app 3000 #(println (str "Listening on port " (-> @server .address .-port))))) )

(nodejs/enable-util-print!)
(set! *main-cli-fn* main)

