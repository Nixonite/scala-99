object P07{

    def flattenNested(l: List[Any]): List[Any] = l flatMap {
        case xs: List[_] => flattenNested(xs)
        case x => List(x)
    }
}
