(ns fullstack.dispatch
  (:require [net.eighttrigrams.defn-over-http.core :refer [defdispatch-with-args]]
            [fullstack.resources :refer [list-resources]]
            [fullstack.config :as config]
            [fullstack.auth :refer [login]]))

(def log-in (login config/secret config/users))

#_{:clj-kondo/ignore [:unresolved-symbol]}
(defdispatch-with-args handler list-resources log-in)