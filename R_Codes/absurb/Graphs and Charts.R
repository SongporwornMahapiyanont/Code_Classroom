x <- c(230,395,417,595,476,386,640,542)
hist(x,main = "grapth",xlab ="horizontal",col ="red")
hist(x)

boxplot(x,horizontal = TRUE,main = "grapth",col = "blue")

IQR(x)
range(x)
640-230

x <- 4
dpois(x,2.5)
ppois