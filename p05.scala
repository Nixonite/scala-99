object P05{

    def reverseList[A](l: List[A]): List[A] = l match{
        case Nil => Nil
        case x:: xs => reverseList(xs) ::: List(x)
    }

    def reverseWithFold[A](l: List[A]): List[A] = l.foldLeft(List[A]()) { (x, xs) => xs:: x}
}
