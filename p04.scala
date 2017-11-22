object P04 {

    def len[A](l: List[A]): Int = l match{
        case Nil => 0
        case x :: tail => 1 + len(tail)
    }

    def lenFunctional[A](l: List[A]): Int = {
        l.foldLeft(0) { (c, _ ) => c+1 }
    }
}
