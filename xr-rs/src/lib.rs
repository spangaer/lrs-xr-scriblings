#[no_mangle]
pub extern "C" fn rusty_increment(x: i32) -> i32 {
    x + 1
}
