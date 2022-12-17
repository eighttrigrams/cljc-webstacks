# cljc-webstacks

## fullstack-cljc

Another web application. The main theme of the backend is a layered data-driven architecture. The latter is implemented in terms of a single API endpoint and then a dispatch mechanism based on the data structure supplied via the request body. 

Uses `jwt`-based authentication.

## mount-api

In part this was created, amongst other things, to understand a luminus starter project which used `mount`. 
Apart from that, I took the approach of `fullstack-clj` a step further insofar as
now authorization also gets done over the now single endpoint.

## fullstack-cljc-defn-over-http

The same as fullstack-clj, but this time using [defn-over-http](https://github.com/eighttrigrams/defn-over-http)
to mediate the communication between frontend and backend. Here it handles authorization as well as resource queries.

## reagent-react18-mount

### Stack

- Ring
- Compojure
- Shadow CLJS
- Reagent (with React 18)
- Mount
