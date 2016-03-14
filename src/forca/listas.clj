(def numeros [1 ,2 ,3 ,4 ,5 ])

(def carros [50000.0 ,60000.0])


(defn impar? [x] (< 0 (rem x 2)))

(defn par? [x] (= 0 (rem x 2)))

(remove impar numeros

(remove (fn [x] (= (rem x 2) 1)) numeros)

(map (fn [x] (* x 3)) numeros)

(filter (fn [x] (or (< x 2) (> x 4))) numeros)

(def palavras #{"A" "L" "U" "R"})
(contains? palavra "A")
(contains? palavra "O")
