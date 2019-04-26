(defn collatz
  ([start] (collatz start start 0))
  ([start current length]
    (if (= current 1)
      [start current length]
        (if (even? current)
          (recur start (/ current 2) (inc length))
          (recur start (inc (* current 3)) (inc length))))))

(def collatz-sequences
  (map collatz (iterate inc 1)))

(println (first (apply max-key #(nth % 2) (take 1000000 collatz-sequences))))
