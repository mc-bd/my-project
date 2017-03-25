install.packages("xlsx")
# Verify the package is installed.
any(grepl("xlsx",installed.packages()))

# Load the library into R workspace.
library("xlsx")
library("methods")
library("xlsx")

data<-read.xlsx("C:/Users/student/Documents/input.xlsx",sheetIndex = 1)
data

data1
Sys.setlocale("LC_COLLATE", "ko_KR.UTF-8")
data1

data<-read.xlsx("C:/Users/student/Documents/프로젝트/고객정보.xlsx", sheetIndex = 1)
data
user<-read.csv("C:/new/user.csv")
user


employees1
install.packages("sqldf")
library(sqldf)
install.packages("RJDBC")
library(RJDBC)
driveload1<-JDBC("oracle.jdbc.driver.OracleDriver",
                 "C:/new/ojdbc6.jar")
dbCon1<-dbConnect(driveload1,"jdbc:oracle:thin:@localhost:1521:xe","db","db")
emp<-dbGetQuery(dbCon1,"select * from product")
dept<-dbGetQuery(dbCon1,"select * from dept;")
emp
dept


listval1<-list(irum="ondal", tel="010-8888-7777", sal=300)

require(MASS)
tail(birthwt)
str(birthwt)

str(user)
out=lm(bwt~ age+lwt+factor(race)+smoke+ptl+ht+ui,data=birthwt)rrrr
anova(out)
out2=lm(bwt~ lwt+factor(race)+smoke+ht+ui,data = birthwt)
anova(out2,out)
anova(out2)
summary(out2)
summary(out)


tong<-read.csv("C:/new/100.csv")
tong
str(tong)
out1=lm(spend~ family+age+frange+X.income+serplus+spendr, data=tong)
anova(out1)
out3=lm(spend~time+family+age+frange+X.income+serplus+spendr,data=tong)
anova(out3)
summary(out3)
tt<-read.csv("C:/new/100_1.csv")
tt
str(tt)


tt<-read.csv("C:/new/111.csv")
tt
str(tt)
#'data.frame':	14 obs. of  31 variables:
#$ year          : int  2003 2004 2005 2006 2007 2008 2009 2010 2011 2012 ...
#$ level         : int  100 100 100 100 100 100 100 100 100 100 ...
#$ members       : num  2.53 2.49 2.45 2.42 2.36 2.34 2.36 2.31 2.29 2.25 ...
#$ age           : num  56.1 57.1 57.4 59.7 61 ...
#$ distribution  : num  10.2 9.3 9.51 9.29 8.59 7.76 7.66 6.27 6.12 5.32 ...
#$ totalincome   : int  646293 647825 630474 645140 625717 617171 625237 615542 617786 624595 ...
#$ ordinary      : int  599863 605922 592408 608468 590365 576178 577921 557862 560305 552887 ...
#$ earning       : int  246846 239079 227229 211611 174075 161163 206240 153556 161343 123401 ...
#$ business      : int  131815 129953 105108 120649 115112 81476 90748 94164 61568 71773 ...
#$ property      : int  12104 12245 8195 9824 8062 8088 6810 8783 5495 9914 ...
#$ transfer      : int  209097 224646 251876 266385 293116 325451 274124 301359 331900 347798 ...
#$ nonrecurring  : int  46430 41902 38066 36672 35352 40993 47316 57680 57481 71708 ...
#$ totalspend    : int  911810 950998 957994 945955 954211 1032103 1020677 1063012 1058369 1072702 ...
#$ consumption   : int  772554 811603 824673 813266 817092 885623 860537 904568 906440 925488 ...
#$ food          : int  177914 189827 188653 181827 186766 210823 197325 214648 220037 225296 ...
#$ soju          : int  16515 18228 18465 18953 18494 19294 17544 15973 15745 19804 ...
#$ clothing      : int  36621 35780 34975 34806 32495 41073 34558 35995 31160 34195 ...
#$ housing       : int  123989 120807 122461 127849 139723 134764 150971 162870 170130 174648 ...
#$ supplies      : int  22854 24387 24644 27622 33812 33433 25187 33417 32076 32597 ...
#$ medical       : int  77569 77065 78265 87348 94303 110931 101126 102840 109297 111842 ...
#$ transportation: int  66585 66904 81676 69137 67160 73482 63541 63727 66153 62734 ...
#$ communication : int  56455 58290 60855 57655 55851 57990 55780 56909 55203 51535 ...
#$ entertainment : int  33073 34893 33842 33643 33269 36607 34852 38019 35580 43813 ...
#$ education     : int  41236 46408 57060 50740 44122 49098 58390 55183 52174 44390 ...
#$ eatout        : int  72301 74962 74619 68382 65494 71733 71786 70511 68273 71573 ...
#$ etc           : int  47441 64053 49158 55305 45604 46395 49477 54473 50611 53061 ...
#$ nonconsumption: int  139256 139395 133321 132689 137119 146481 160140 158445 151929 147215 ...
#$ disposable    : int  507037 508430 497153 512451 488598 470690 465096 457097 465858 477380 ...
#$ surplus       : int  -265517 -303174 -327520 -300815 -328494 -414932 -395440 -447471 -440583 -448108 ...
#$ surplusrate   : num  -52.4 -59.6 -65.9 -58.7 -67.2 -88.2 -85 -97.9 -94.6 -93.9 ...
#$ avgspendrate  : num  152 160 166 159 167 ...
confint(result1)

re1=lm(totalspend~food+soju+clothing+housing+supplies+medical+transportation+communication+entertainment+education+eatout+etc+nonconsumption,data=tt)
anova(re1)
summary

re1=lm(totalspend~food+nonconsumption,data=tt)
anova(re1)

m2 <- step(re1, direction = "both")
re1
m <- regsubsets(totalspend~ ., data = tt)
confint(m)
m <- lm(totalspend ~ ., data = tt)
m2 <- step(m, direction = "both")

rs<-summary(regsubsets(totalspend~.,data = tt, nbest=(ncol(tt)-1)))

rs<-summary(regsubsets(totalspend~totalincome,age,ordinary,disposable,surplus,data =tt))
rs=regsubsets(totalspend~.,data=tt)
summary(rs)


m=regsubsets(medv~.,data=BostonHousing)
summary(m)

m1=lm(totalspend~consumption,data=tt)
anova(m1)
summary(m1)

m2=lm(totalspend~totalincome+surplus,data =tt)
anova(m2)
summary(m2)

m3=lm(totalspend~ordinary+nonrecurring+surplus,data=tt)
anova(m3)
summary(m3)


t2<-read.csv("C:/new/222.csv")
t2
str(t2)

p1=regsubsets(totalspend~.,data = t2)
summary(p1)

p1=regsubsets(totalincome~.,data = t2)
summary(p1)

##############################################
#분석에 필요한 라이브러리 설치
library(leaps)
t3<-read.csv("C:/new/tttotal.csv")
t3

summary(t3)
str(t3)
p3=regsubsets(totalspend~.,data=t3)
summary(p3)

m2=lm(totalspend~totalincome+food+transportation+education,data=t3)
anova(m2)
summary(m2)


m3=lm(totalspend~totalincome+ordinary+nonrecurring+consumption+entertainment+nonconsumption+surplus+avgspendrate,data=t3)
anova(m3)
summary(m3)

confint(m3)
plot(m3)

##########################################################
q1=regsubsets(totalspend~., data=ttal)
summary(q1)

q1

plot(m2,scale="adj2")


library(rJava)
library(sqldf)
library(RJDBC)
driveload1<-JDBC("oracle.jdbc.driver.OracleDriver",
                 "C:/new/ojdbc6.jar")
dbCon1<-dbConnect(driveload1,"jdbc:oracle:thin:@70.12.114.107:1521:xe","db","db")
goal<-dbGetQuery(dbCon1,"select * from BD_GOAL")

emp
dept
goal


















