cost <- c(75,80,76,67,81,72,65,71,70,75,69,75,68,72,75)
mean(cost)

t.test(x=cost,conf.level = 0.90)


t.test(x=cost,alternative = "two.sided",mu=70,conf.level = 0.90)
t.test(x=cost,alternative = "less",mu=70,conf.level = 0.90)


men<-c(116,124,123,127,121,121,119,118,121,120,126,120,130,123,122,125)
women<-c(101,95,100,110,95,89,95,100,99,102,105,106,95,101)

t.test(x=men,y=women,alternative = "two.sided", mu = 0,paired = FALSE,var.equal = TRUE,conf.level = 0.95)