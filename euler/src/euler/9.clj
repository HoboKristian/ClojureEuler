(def digits (range 1000))
(defn is-triplet[[a b c]]
  (= (+ (* a a) (* b b)) (* c c)))
(defn increasing[[a b c]]
  (and (< a b) (< b c)))

(println (apply * (first (filter (every-pred increasing is-triplet) (for [a digits b digits] [a b (- 1000 a b)])))))
