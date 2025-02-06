git # com.Querycart 
### 
### 
***

1. QA'ler kendi Feature dosyasında çalışır
2. Framework'te hiçbir class isminde QA ismi yazmayacaktır
3. Test features'ların isimlendirmesi WWC#_US_001_021.feature seklinde olmalıdır
4. Locate alinan element nerenin elementi oldugu aciklama satiri ile açıklanmalıdır
   || orn:  Homepage>> LoginLink>> Email Text Box ||

<br/>

### Git Kullanımı "Aman Dikkat"
***
1. Herkes Github version control ile proje reposunu local'inde olusturduktan sonra kendi adina birer branch olusturur.
    * `git branch <isim>`

2. sag alt panelde branch ismimizin yazili oldugu kisimdan
    * main' e tikliyoruz
    * update'e tikliyoruz
    * sonra merge 'main' into 'brancismi' yazan kısma tikliyoruz
    * bu şekilde pull işlemini gerçekleştirmiş oluyoruz
    * (Alternatif olarak main de "git pull" işlemi, ardından "git checkout 'branch ismi' " ile kendi branch'ımıza geçme işlemi
    * sonra "git merge main" ile kendi branch'ımızla merge işlemi yapılır.)

3. Yaptigi degisiklikleri kucuk commitlerle kendi branchinda saklar. Burada tavsiye edilen sadece sizin yaptiginiz degisikliklerin eklenmesidir.
    * 'git add . kesinlikle kullanilMAMAli'
    * 'git add (degisiklik yapilan yerin dosya yolu yani "pat from content root" u)
    * 'git commit -m "İsim/tarih/Yapilan Degisiklikler icin bir mesaj yazilir."'
      Örn >>> git commit -m "<Kendi isminiz>/02.07/loginClass Eklendi"
4. git push

5. gelen linkten ustteki linke tiklanir ve github hesabi sayfasi acilir. 
(Burada kodlarınızın Team Lead tarfafından main ile sorunsuz birleştirilmesi için
pull request oluşturmalısınız)

6. Push ettigimiz kendi kodumuz icin **request** olusturulur ve is biter

7. Merge request islemi yalnızca Team Lead tarfindan gerceklestirilir


### Isimlendirmelerde dikaat edilecekler
***
| Element Türü   | Variable name |
|----------------|---------------|
| Button         | signInButton  | 
| DateInput      | dateInputX    | 
| InputBox       | ınputBoxX     | 
| Logo           | logoX         |
| icon           | iconX         |
| Sadece text    | labelX        |
| Drop down      | dropDownX     |
| Radio Button   | radioButtonX  |
| Check box      | checkBoxX     |
| Tablo Sütünu   | columnX       |
| Tablo Satiri   | rowX          |
| Kisi Resimleri | imageProfileX |
| ürün resimleri | imageProductX |
| Linkler        | linkX         |
| Tablo          | tableX        |