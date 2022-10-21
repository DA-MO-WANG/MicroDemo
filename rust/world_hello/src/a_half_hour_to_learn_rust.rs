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



