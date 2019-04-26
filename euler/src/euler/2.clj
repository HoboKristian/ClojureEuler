(defn fibonacci
  ([] (fibonacci '(1 0)))
  ([coll]
   (if (< (first coll) 4000000)
    (recur (cons (+ (first coll) (second coll)) coll))
    (drop 1 coll))))

(println (reduce + (filter even? (fibonacci))))
