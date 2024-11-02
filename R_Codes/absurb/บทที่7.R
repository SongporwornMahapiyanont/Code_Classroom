age.x<-c(5,4,6,5,5,5)
price.y<-c(85,103,70,82,89,98)
model<-lm(price.y~age.x)
summary(model)

cor(age.x,price.y)
