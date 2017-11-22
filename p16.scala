object P16{
    def drop[A](n: Int, ls: List[A]): List[A] = {
        ls.zipWithIndex filter { e=> (e._2 +1) %n !=0} map { e=> e._1 }
    }
}
