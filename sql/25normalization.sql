use DB1;

select *
from w3schools.Products;

#상품에 대한
#상품번호,상품명, 단위 , 가격 ,
# 카테고리 번로 FK
# 공급자 번호 FK


# 카테고리
                    #1,2,3NF
#인의적 프라이머리키,카테고리 명, 카테코리 설명

USE w3schools;

ALTER TABLE Products
    ADD CONSTRAINT FOREIGN KEY FK1 (CategoryID) REFERENCES Categories (CategoryID);
ALTER TABLE Products
ADD CONSTRAINT  FOREIGN KEY  FK2(SupplierID) REFERENCES Suppliers(SupplierID);

