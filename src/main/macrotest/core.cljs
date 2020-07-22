(ns macrotest.core
  (:require [tracks.core :refer-macros (deftrack)]))

(deftrack calculate-price-for-order
  {:a {:c price}
   :b {:d quantity}}
  (* price quantity))