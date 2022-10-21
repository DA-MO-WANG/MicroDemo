fn rust_code1() {
    //怎么简单声明一个变量
    //怎么赋值
    let x;
    x = 42;
}
fn rust_code2() {
    //把变量类型固定下来
    let x: i32;
    x = 42;

    let y: i32 = 42;
}

fn rust_code3() {
    let x;
    x = 42;
    //必须先初始化才能放进方法里
    foobar(x);
}

fn rust_code4() {
    //_ 用来丢弃不想要的信息
    let _ = 42;
    let _ = get_thing();
}

fn rust_code5() {
    //这里不会冲突，最新的x代替了旧的x
    let x = 13;
    let x = x + 3;
}

fn rust_code6() {
    //pair 元组概念，访问其中元素用 .index
    let pair = ('a',17);
    pair.0;
    pair.1;

    //指定类型来声明
    let pair: (char, i32) = ('a',44);
    //元组元素 映射成 独立属性
    let (some_char, some_int) = ('a',13);
    println!("{}",some_char);
    println!("{}",some_int);
    //元组接收方法返回值
    let (left, right) = slice.split_at(middle);
    let (_,right) = slice.split_at(middle);
}

fn rust_code7() {
    let x = vec![1,2,3,4,5,6,7,8]
        .iter()
        .map(|x| x + 3)
        .fold(0, |x, y| x + y);
}
fn rust_code8 -> i32 {
    //带返回值的函数
    4
}

fn rust_code9 {
    let x = {
        let y = 1;
        let z = 2;
        y + z
    }
}
//match 类似switch case
fn rust_code10() -> i32 {
    match true {
        true => 6,
        false => 4,
    }
}
fn rust_code11() {
    //类似import 倒入某些第三方文件
    //命名空间-std::cmp::min
    //std->library
    //cmp->module
    //min->function
}
//结构体
//声明名字和类型
struct Vec2 {
    x: f64,
    y: f64,
}

fn rust_code12() {
    let v3 = Vec2 {
        x: 14.0,
        ..v2
    }

    let v4 = Vec2 {..v3 };
}
//类似类结构
struct Number {
    odd: bool,
    value: i32,
}

fn main() {
    let one = Number {odd: true, value: 1};
    let two = Number {odd: false, value: 2};
    print_number(one);
    print_number(two);
}

//结构体作为某种pattern,pattern 作为判断条件
//
fn print_number(n: Number) {
    if let Number {odd: true, value } = n {
        println!("Odd number: {}",value);
    } else if let Number {odd: false, value } = n {
        println!("Even number: {}", value);
    }
}

fn rust_code13() {
    match n {
        Number { odd: true, value } => println!("Odd number: {}", value),
        Number { odd: false, value } => println!("Even number: {}", value),
    }
}

struct Number {
    odd: bool,
    value: i32,
}

//给结构体添加一个内置方法，绑定了这个结构的性质函数
//比如这里判断正负性
impl Number {
    fn is_strictly_positive(self) -> bool {
        self.value > 0
    }
}

fn rust_code14() {
    //rust 中默认 let 定义的变量不可变
    //需要可变设计时，添加相应的关键字 mut
    let n = Number {
        odd: true,
        value: 17,
    };
    n.odd = false;
}

//类似接口
//接口聚合某些性质,不带具体实现
//接口会绑定在某些结构上
trait Signed {
    fn is_strictly_negative(self) -> bool;
}

//绑定时，顺便指定具体实现
impl Signed for Number {
    fn is_strictly_negative(self) -> bool {
        self.value < 0
    }
}

impl std::ops::Neg for Number {
    type Output = Number;
    fn neg(self) -> Number {
        Number {
            value: -self.value,
            odd: self.odd,
        }
    }
}
fn rust_code15() {
    let n = Number {odd: true, value: 987};
    let m = -n;
    println!("{}",m.value);
}








