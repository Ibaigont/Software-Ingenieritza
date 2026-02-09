# Software Ingenieritza - [Proiektuaren Izena]

![Egoera](https://img.shields.io/badge/Egoera-Garapenean-yellow) ![Lengoaia](https://img.shields.io/badge/Lengoaia-Java-orange) ![Lizentzia](https://img.shields.io/badge/Lizentzia-MIT-blue)

Ongi etorri **Software Ingenieritza** irakasgaiko proiektuaren biltegi ofizialera. Proiektu hau [deskribapen laburra: adib. liburutegi kudeaketa sistema bat / erreserba aplikazio bat] da.

## 📋 Aurkibidea
- [Deskribapena](#-deskribapena)
- [Ezaugarri Nagusiak](#-ezaugarri-nagusiak)
- [Erabilitako Teknologiak](#-erabilitako-teknologiak)
- [Instalazioa eta Exekuzioa](#-instalazioa-eta-exekuzioa)
- [Proiektuaren Egitura](#-proiektuaren-egitura)
- [Egilea](#-egilea)

---

## 📖 Deskribapena
Repo honetan EHU-ko Software Ingenieritzako irakasgaiko laborategiak eta proiektua igoko ditut.

## ✨ Ezaugarri Nagusiak
* **Erabiltzaileen Kudeaketa:** Erregistroa, saio-hasiera eta rolak (Admin/Erabiltzailea).
* **Interfaze Grafikoa:** [Swing / JavaFX / Web] bidez garatutako interfazea.
* **Probak:** Unitate-probak [JUnit / Mockito] erabiliz.

## 🛠 Erabilitako Teknologiak
* **Lengoaia:** [Adib. Java JDK 17]
* **Gomendatutako IDEa:** [Adib. Eclipse / IntelliJ IDEA]
* **Mendekotasun Kudeatzailea:** [Adib. Maven / Gradle]
* **Datu-basea:** [Adib. MySQL]
* **Bertsio Kontrola:** Git & GitHub

## 🚀 Instalazioa eta Exekuzioa

Jarraitu urrats hauek proiektua zure ordenagailuan exekutatzeko:

1.  **Biltegia klonatu:**
    ```bash
    git clone [https://github.com/Ibaigont/Software-Ingenieritza.git](https://github.com/Ibaigont/Software-Ingenieritza.git)
    ```
2.  **IDEn inportatu:**
    * Ireki zure IDEa (Eclipse/IntelliJ).
    * Aukeratu *File > Open / Import Project*.
    * Bilatu klonatutako karpeta.
3.  **Datu-basea konfiguratu (beharrezkoa bada):**
    * Exekutatu `sql/schema.sql` script-a taulak sortzeko.
    * Egokitu `config.properties` fitxategia zure kredentzialekin.
4.  **Exekutatu:**
    * Bilatu `Main.java` klasea eta exekutatu.

## 📂 Proiektuaren Egitura
Kodea honela antolatuta dago (adibidez, MVC arkitektura jarraituz):

* `/src`: Iturburu-kodea.
    * `/models`: Domeinu-klaseak eta datuen logika.
    * `/views`: Leihoak eta erabiltzaile-interfazea.
    * `/controllers`: Kontrol-logika.
* `/test`: Unitate-probak (JUnit).
* `/docs`: Dokumentazioa (JavaDoc, UML diagramak).

## 👥 Egilea
Proiektu hau **[Talde Zenbakia edo Izena]** taldeak garatu du:

* **Ibaigont** - *Backend / Frontend Garapena*


---
*Software Ingenieritza irakasgairako egindako proiektua - [2026]*
