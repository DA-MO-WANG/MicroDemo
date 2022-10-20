// fn main() {
//   let mut name = 3;
//   name = 4;
//   println!("name参数值为{}", name);
// }
// fn main() {
//   let (a, mut b): (bool, bool) = (true, false);
//   println!("a = {:?}, b = {:?}", a, b);
//   b = true;
//   assert_eq!(a, b);
// }
// struct Struct {
//   e:i32
// }
// fn main() {
//   let (a, b , c , d, e);
//   (a, b) = (1, 2);
//   [c,..,d,_] = [1, 2, 3, 4, 5];
//   Struct {e, ..} = Struct {e : 5};
//   assert_eq!([1, 2, 1, 4, 5], [a, b , c, d, e]);
// }

// const MAX_POINTS: u32 = 100_000;
fn main() {
  // let x = 5;
  // let x = x + 1;
  // {
  //   let x = x * 2;
  //   println!("The value of x in the inner scope is: {}",x);
  // }
  // println!("The value of x is: {}",x);

  let x;
  x = 42;
  let y = 43;
  let z: i32;
  z = 42;
  let m: i32 = 44;

  let n;
  n = 55;
  let _ = 42;
  //let _ = get_thing();
  let pair = ('a', 17);
  pair.0;
  pair.1;

  let pair: (char, i32) = ('a', 145);
  let x = vec![1, 3, 4, 5, 6, 78]
    .iter()
    .map(|x| x + 3)
    .fold(0, |x, y| x + y);
}

fn greet() {
  println!("Hi there!")
}
fn fair_dice_roll() -> i32 {
  4
}
