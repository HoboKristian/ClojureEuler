(defn cart [colls]
  (if (empty? colls)
    '(())
    (for [more (cart (rest colls))
          x (first colls)]
      (cons x more))))

(defn cross[n]
  (let [n (range (Math/pow 10 (dec n)), (Math/pow 10 n))]
  (cart `(~n ~n))))

(defn is-palindrome[n]
  (= (str n) (clojure.string/reverse (str n))))

(println
  (apply max
         (filter is-palindrome
                 (map #(int (* (first %) (second %))) (cross 3)))))
