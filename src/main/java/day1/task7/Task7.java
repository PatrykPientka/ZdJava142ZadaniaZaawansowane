package day1.task7;

public class Task7 {
    public static void main(String[] args) {
        WeaponClip weaponClip = new WeaponClip(3);
        weaponClip.loadBullet("naboj 1");
        weaponClip.loadBullet("naboj 2");
        weaponClip.loadBullet("naboj 3");
        // weaponClip.loadBullet("maboj 4"); spodziewamy sie IllegalArgumentException

        weaponClip.shot();
        weaponClip.shot();
        weaponClip.shot();

        weaponClip.shot(); // spodziewamy sie komunikatu o pustym magazynku

    }
}
