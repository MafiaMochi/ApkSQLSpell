package com.samuel.apksqlite;

import java.util.ArrayList;

public class SpellData {
    private static String[] heroNames = {
            "Arival",
            "Aegis",
            "Execute",
            "Flameshot",
            "Flicker",
            "Inspaire",
            "Petrify",
            "Purify",
            "Retribution",
            "Revilatize",
            "Sprint",
            "Vengeance"
    };

    private static String[] heroDetails = {
            "CoolDown : 75 detik, teleport ke turet satu tim(termasuk yang telah dihancurkan) atau minion setelah melakukan chanting selama 3 detik, meningkatkan movment speed sebesar 60% selama 3 detik(berkurang seiring waktu). sementara itu, menningkatkan basic attack berikutnya, memberikan 100(+1-*level hero true damage tambahan dan menyebabkan efek slow kepada target yang mengenainya sebesar 45% selma 1 detik jika dibatalkan cooldown berkurang sebanyak 30 detik",
            "CoolDown : 90 detik, secara instan mengaktifkan sebuah shield yang akan menyerap 670(+50*level hero) damage (meningkat seiring level hero) dan berlangsung selama 3 detik, hero satu tim disekitar dengan hp paling rendah juga akan meneriam 50% shield",
            "CoolDown : 90 detik, memberi true damage sebesar 200(+20*level hero) dan 10% dari hp lawan yang telah ditentukan (meningkat sesuai level).efek shield tidak akan mempengaruhi damage yang diberikan dan jika target terbunuh dengan execute, cooldown akan berkurang sebesar 40%",
            "CoolDown : 50 detik, menembakan flaming shot kearah yang ditentukan yang dapat menyebabkan efek knockback kepada lawan yang berada didepan. memberikan 160(+40% total magic power) - 640(+160% total magic power) magic damage (berskala dengan jarak) kepada lawan yang terkena dan menyebabkan efek slow kepada mereka sebesar 60% selama 0.5 detik",
            "CoolDown : 120, teleport ke jarak tertentu di arah yang spesfik. selama 1 detik setelah teleport, meningkatkan5(+1*level hero) physical defense dan magical defense",
            "CoolDown : 60 detik, sangat memperkuat hero untuk waktu yang singkat. 8 basic attack berikutnya akan mengabaikan 8(+1*level hero) physical defense (meningkat dengan level hero) dan meningkatkan attack speed hero anda sebesar 55%. berlangsung selama 5 detik",
            "CoolDown : 90 detik, memberi 100(+15*LevelHero) magic damage ke musuh di sekitar (meningkatk sesuai level) dan menyebabkan efek stun terhadap target selama 0.7 detik",
            "CoolDown : 75 detik, menghapus seluruh DEBUFF seketika. mendapat efek immune terhadap efek CC selama 1.2 detik dan meningkatkan movment speed sebesar 30%",
            "CoolDown : 35 detik, memberikan 540(+69*level hero) true damage terhadap creep atau minion terdekat (damage meningkat seiring dengan level). pasif: ketika membawa item equipment jungling. mengurangi damage yang diterima dari creep sebesar 40% secara permanen",
            "CoolDown : 100 detik, memangil healing spring. di mana teman satu tim yang berada dalam area efek memulihkan 2,5% dari max hp mereka setiap 0.5 detik, dan memperkuat efel shield dan hp regen yang mereka terima sebesar 25%( peningkatan ini tidak dapat distack). berlangsung selama 5 detik",
            "CoolDown : 100 detik, meningkatkan movement speed sebesar 40%  untuk 8 detik, efek akan hilang setelah 2 detik. setelah menggunkan sprint, hero kemudian mengurangi waktu, CC dan mendapatkan efek imune terhadap efek slow untuk 2 detik.",
            "CoolDown : 70 detik, dalam 3 detik. ketika menerima damage dari unit lawan, vengeance memberikan magic damage. setelah itu meregenerasi hp setara dengan 50% dari damage yang diberikan oleh vengeance."
    };

    private static int[] heroesImages = {
            R.drawable.aegis,
            R.drawable.arrival,
            R.drawable.execute,
            R.drawable.flameshot,
            R.drawable.flicker,
            R.drawable.inspaire,
            R.drawable.petrify,
            R.drawable.purify,
            R.drawable.retributioon,
            R.drawable.revitalize,
            R.drawable.sprint,
            R.drawable.vengeance
    };

    static ArrayList<Spell> getListData() {
        ArrayList<Spell> dSpells = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Spell spell = new Spell();
            spell.setNama(heroNames[position]);
            spell.setDetail(heroDetails[position]);
            spell.setFoto(heroesImages[position]);
            dSpells.add(spell);
        }
        return dSpells;
    }
}
