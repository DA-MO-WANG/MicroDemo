// fn main() {
//   let mut name = 3;
//   name = 4;
//   println!("name参数值为{}", name);
// }
fn main() {
  let (a, mut b): (bool, bool) = (true, false);
  println!("a = {:?}, b = {:?}", a, b);
  b = true;
  assert_eq!(a, b);
}
