(ns forca.core
  (:gen-class))

(def total-de-vidas 6)


(defn perdeu [] (print "Voce Perdeu"))

(defn jogo [vidas] 
	(if (= vidas 0)
		(perdeu)
		(do 
			(println vidas)
			(jogo (- vidas 1))
		)
	)
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
