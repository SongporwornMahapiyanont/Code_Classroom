tomato.y<-c(12,10,9,9,15,12,13,12,6,11,10,7)
chemical.x<-c(1,1,1,1,2,2,2,2,3,3,3,3)
chemical.x_factor<-factor(chemical.x)
#ANOVA
result_aov <- aov(tomato.y~chemical.x_factor)
summary(result_aov)