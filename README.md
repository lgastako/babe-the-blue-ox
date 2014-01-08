# babe-the-blue-ox

Babe the Blue Ox puts console.log's peanut butter in ClojureScript's chocolate.
Or vice versa, depending on your kink.

## Usage

Require Babe.

```clojure
(ns your.namespace
  (require [babe.ox :refer [log js-log])))
```

Log some clojurescript data structures:

```clojure
  (let [a {:a "hello"}
        b ["b" :world]
        c #{:hello "world"}]
    (log "A: %o  B: %o  C: %o" a b c)
    (js-log "A: %o  B: %o  C: %o" a b c)
    (log :raw "A: %o  B: %o  C: %o" a b c))
```

The output of the above would be:

    A: "{:a "hello"}"  B: "["b" :world]"  C: "#{"world" :hello}" main.js:10274
    A: >cljs.core.PersistentArrayMap  B: >cljs.core.PersistentVector  C: >cljs.core.PersistentHashSet
    A: >cljs.core.PersistentArrayMap  B: >cljs.core.PersistentVector  C: >cljs.core.PersistentHashSet

Where the >'s represent the expandable arrows that let you get your grubby paws
all over the gooey internals of the delicious ClojureScript flavored javascript
objects you're logging.  You digust me.

## License

Copyright © 2014 John Evans

Distributed under the MIT License, differently than Clojure.
