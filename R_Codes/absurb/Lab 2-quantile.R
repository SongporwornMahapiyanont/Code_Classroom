x <- c(143,165,188,175,190,126,135,123)
quantile(x,type=5,probs =seq(0,1,0.25))
quantile(x,type = 5,probs=seq(0,1,0.1))
quantile(x,type = 5,probs=seq(0,1,0.01))