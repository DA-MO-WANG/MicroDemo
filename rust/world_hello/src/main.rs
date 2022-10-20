fn main() {
    let x = "out";
    {
        let x = "in";
        println!("{}", x);
    }
    println!("{}", x);
}
