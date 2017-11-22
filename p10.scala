object P10{

    def encode[A](ls: List[A]): List[(Int, A)] = {
        P09.packConsecutives(ls) map {e => (e.length, e.head)}    
    }
}
