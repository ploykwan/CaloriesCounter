package com.example.kwankaew.caloriescounter.Model

class ThaiMenuRepository:MenuRepository(){

    val menuList =  ArrayList<Menu>()

    override fun loadAllMenu() {
        menuList.add(Menu("กระเพาะปลา",150,"ชาม"))
        menuList.add(Menu("กล้วยไข่",40,"ลูก"))
        menuList.add(Menu("ก๋วยจั๊บ",240,"ชาม"))
        menuList.add(Menu("ข้าวมันไก้",596,"จาน"))
        menuList.add(Menu("ข้าวขาหมู",690,"จาน"))
        menuList.add(Menu("ข้าวไข่เจียว",445,"จาน"))
        menuList.add(Menu("ข้าวซอยไก่",395,"จาน"))
        menuList.add(Menu("ไอศกรีมชอกโกแล็ต",110,"สกูป"))
        menuList.add(Menu("ไอศกรีมเรซิน",264,"สกูป"))
        menuList.add(Menu("ไอศกรีมวนิลา",140,"สกูป"))
        menuList.add(Menu("ไอศกรีมกะทิ",108,"สกูป"))
        menuList.add(Menu("ต้มยำไก่",60,"ถ้วย"))
        menuList.add(Menu("ต้มยำกุ้ง",65,"ถ้วย"))
        menuList.add(Menu("ต้มยำปลากระพง",80,"ถ้วย"))
        menuList.add(Menu("ต้มยำปลาหมึก",90,"ถ้วย"))
        menuList.add(Menu("กระเพาะปลา",150,"ชาม"))
        menuList.add(Menu("ก๋วยเตี๋ยวคั่วไก่",435,"จาน"))
        menuList.add(Menu("กะหรี่พัฟ",157,"ตัว"))
        menuList.add(Menu("แกงเขียวหวานไก่",240,"ถ้วย"))
        menuList.add(Menu("แกงจืดตำลึงหมูสับ",90,"ถ้วย"))
        menuList.add(Menu("ขนมจีนน้ำยา",332,"จาน"))
        menuList.add(Menu("ข้าวผัดกะเพราหมู",580,"จาน"))
        menuList.add(Menu("ข้าวต้มทรงเครื่อง",230,"ถ้วย"))
        menuList.add(Menu("ข้าวผัดคะน้าหมูกรอบ",670,"จาน"))
        menuList.add(Menu("ข้าวหมูทอดกระเทียม",525,"จาน"))
        menuList.add(Menu("โจ๊กหมู",250,"ถ้วย"))
        menuList.add(Menu("เฉาก๊วย",90,"ถ้วย"))
        menuList.add(Menu("ซาลาเปาไส้หมู",202,"ลูก"))
        menuList.add(Menu("ต้มข่าไก่",210,"ถ้วย"))
        menuList.add(Menu("ทุเรียน",59,"เม็ด"))
        menuList.add(Menu("บะหมีกึ่งสำเร็จรูป",253,"ก้อน"))

    }

    override fun getMenus(): ArrayList<Menu> {
        return menuList
    }

}