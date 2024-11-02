y<-c(12,10,9,9,15,12,13,12,6,11,10,7)
x<-c(1,1,1,1,2,2,2,2,3,3,3,3)
x_factor<-factor(x)

result_aov<-aov(y~x_factor)
summary(result_aov)