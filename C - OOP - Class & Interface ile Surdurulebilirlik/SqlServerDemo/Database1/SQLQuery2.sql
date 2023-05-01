--yorum satırı

-- * kolon demek

Select ContactName, CompanyName,City from Customers -- bu bir tablodur

--bellekte fake bir tablo oluşur ve bunu bize sunar

Select ContactName Adi, CompanyName SirketAdi, City Sehir from Customers -- değiştirmek için

-- filtreleme sorgusu

Select * from Customers where City = 'Berlin' -- şehri londra olanları getir

-- sql case insensitve yani büyük küçük harf duyarsızdır

Select * from Products where CategoryID=1 or CategoryID=3 --veya

select * from Products where CategoryID=1 and UnitPrice>=10 --ve

select * from Products order by ProductName -- tüm ürünleri seç ürün ismine göre sırala

Select * from Products order by CategoryID --tüm ürünleri seç ürün categori id sine göre sırala
--belli kısmı çalıştırmak için mouse ile o alanı seç ve sol taraftaki execute butanuna bas

Select * from Products order by CategoryID,ProductName--tüm ürünleri seç ürün categori id ve ürün adına göre sırala

select * from Products order by UnitPrice asc --tüm ürünleri seç ürün fiyatına göre sırala artan

select * from Products order by UnitPrice desc --tüm ürünleri seç ürün fiyatına göre sırala azalan

select * from Products where CategoryID=1 order by UnitPrice desc --tüm ürünleri seç category ıd si 1 olanların ürün fiyatına göre sırala azalan


Select count(*) Adet from Products -- ürün addedini söyler yani 77 farklı ürün varmış 
--Group by
--Hangi kategoride kaç farklı ürünümüz var ?

select CategoryID from Products group by CategoryID --datalarımın içine bak ve categoriler tekrar etmeyecek şekilde bana listele
--select edilen kolon group by da belirtilen alan olur sadece

select CategoryID, count(*) from Products group by CategoryID -- her gurupta toplam kaç ürün olduğunu söyler

--içerisinde 10 taneden az ürün çeşidi olan categorileri listele
select categoryID,count(*) from products group by CategoryID having count(*)<10

--Ürün sayıları 10 dan az olanları listele ve fiyatı 20 den büyük olacak şekilde filtrele (where)
select categoryID,count(*) from Products where UnitPrice>20 group by CategoryID having count(*)<10
--having select önündeki count(*) kümülatiflerine uygulanır

--join= birleştirmek
--tüm ürümler ile tüm category leri şuna göre birleştir, ürünlerin categoryID eşit category.CategoryID ise
select * from products inner join Categories on products.CategoryID = Categories.CategoryID

--şeçilen tablolaların kolanlarına göre categories tablosunun categoryID sinin bireleştr ama ürünlerin categoryID eşit category.CategoryID ise
select Products.productID, Products.productName, Products.UnitPrice, Categories.CategoryName from Products inner join categories on products.categoryID=categories.categoryID

--fiyatı 10 dan büyük olanlar için onu categorilerle birleştir
select Products.productID, Products.productName, Products.UnitPrice, Categories.CategoryName from Products inner join categories on products.categoryID=categories.categoryID where Products.UnitPrice>10
--inner join= sadece 2 tabloda eşleşenleri getirir eşleşmeyen varsa onu getirmez!!!

Select * from Products p inner join [Order Details] od on p.ProductID=od.ProductID
--inner join sadece eşleşen kayıtları getirir

--left join= solda olup sağda olmayanları da getir
Select * from Products p left join [Order Details] od on p.ProductID=od.ProductID

--left join= hem eşleşenleri hemde solda olup sağda olmayanları getir
select * from Customers c left join Orders o on c.CustomerID = o.CustomerID

--yeni kayıt olmuş veya hiç ürün almamışların listesi
select * from Customers c left join Orders o on c.CustomerID = o.CustomerID where o.CustomerID is null

--right join= sağda olup solda olmayanları listeler, inner join in tam tersi şekilde çalışır
select * from Customers c right join Orders o on c.CustomerID = o.CustomerID

--birden fazla tabloyu birleştirmek için(join)
select * from Products p inner join [Order Details] od on p.ProductID = od.ProductID inner join
orders o on o.OrderID=od.OrderID 
-- devamında bir şey daha eklemek istenirse inner join yazılıp devam edilir






