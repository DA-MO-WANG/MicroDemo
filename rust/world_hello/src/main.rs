fn main() {
    // let x = "out";
    // {
    //     let x = "in";
    //     println!("{}", x);
    // }
    // println!("{}", x);
    let res = fair_dice_roll();
    println!("{}", res);
}

fn fair_dice_roll1() -> i32 {
    return 4;
}

fn fair_dice_roll2() -> i32 {
    4
}
fn fair_dice_roll3() -> i32 {
    let feeling_lucky = true;
    if feeling_lucky {
        6
    } else {
        4
    }
}

fn fair_dice_roll5() -> i32 {
    let x = true;
    match x {
        true => 6,
        false => 4,
    }
}
fn fair_dice_roll() -> i32 {
    let nick = "232323232";
    nick.len();
}
