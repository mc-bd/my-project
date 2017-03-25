pre1<-function(x1,x2,x3,x4){
    library(rJava);
    library(RJDBC);
    library(DBI);
    libs <- "C:/libs";
    .jinit();                                     
    .jaddClassPath(dir(libs,full.names = TRUE)); 
    
    drv <- JDBC("org.apache.hive.jdbc.HiveDriver");
    conn <- dbConnect(drv,"jdbc:hive2://70.12.114.98:10000/default","root","111111"); 
  query <- "select * from chachacha";
  
  total <- dbGetQuery(conn,query);
  tot2<-lm(formula = chachacha.totalspend ~ chachacha.totalincome+chachacha.food+chachacha.transportation+chachacha.education, data=total )
  tot3<-round(predict(tot2,newdata=data.frame(chachacha.totalincome=x1, chachacha.food=x2, chachacha.transportation=x3,
                                               chachacha.education=x4)),digits=0)
  return(tot3)
}
pre2<-function(x1,x2,x3,x4,x5){
  library(rJava);
  library(RJDBC);
  library(DBI);
  libs <- "C:/libs";
  .jinit();                                     
  .jaddClassPath(dir(libs,full.names = TRUE)); 
  
  drv <- JDBC("org.apache.hive.jdbc.HiveDriver");
  conn <- dbConnect(drv,"jdbc:hive2://70.12.114.98:10000/default","root","111111"); 
  query <- "select * from chachacha";
  
  total <- dbGetQuery(conn,query);
  tot2<-lm(formula = chachacha.totalspend ~ chachacha.ordinary+chachacha.nonrecurring+chachacha.consumption+chachacha.nonconsumption+chachacha.surplus, data=total )
  tot3<-round(predict(tot2,newdata =data.frame( chachacha.ordinary=x1,chachacha.nonrecurring=x2,chachacha.consumption=x3,
                                                chachacha.nonconsumption=x4,chachacha.surplus=x5)),digits=0)
  
  return(tot3)
}
pre3<-function(x1,x2,x3,x4,x5,x6){
  library(rJava);
  library(RJDBC);
  library(DBI);
  libs <- "C:/libs";
  .jinit();                                     
  .jaddClassPath(dir(libs,full.names = TRUE)); 
  
  drv <- JDBC("org.apache.hive.jdbc.HiveDriver");
  conn <- dbConnect(drv,"jdbc:hive2://70.12.114.98:10000/default","root","111111"); 
  query <- "select * from chachacha";
  
  total <- dbGetQuery(conn,query);
  tot2<-lm(formula = chachacha.totalspend ~ chachacha.totalincome+chachacha.ordinary+chachacha.nonrecurring+chachacha.consumption+chachacha.nonconsumption
           +chachacha.surplus, data=total )
  tot3<-round(predict(tot2,newdata =data.frame( chachacha.totalincome=x1,chachacha.ordinary=x2,
                                                chachacha.nonrecurring=x3,chachacha.consumption=x4,
                                                chachacha.nonconsumption=x5,chachacha.surplus=x6)),digits=0)
  
  return(tot3)
}
pre4<-function(x1,x2,x3,x4,x5,x6,x7,x8){
  library(rJava);
  library(RJDBC);
  library(DBI);
  libs <- "C:/libs";
  .jinit();                                     
  .jaddClassPath(dir(libs,full.names = TRUE)); 
  
  drv <- JDBC("org.apache.hive.jdbc.HiveDriver");
  conn <- dbConnect(drv,"jdbc:hive2://70.12.114.98:10000/default","root","111111"); 
  query <- "select * from chachacha";
  
  total <- dbGetQuery(conn,query);
  tot2<-lm(formula = chachacha.totalspend ~  chachacha.totalincome+chachacha.ordinary+chachacha.nonrecurring+chachacha.consumption+chachacha.entertainment 
           +chachacha.nonconsumption+chachacha.surplus+chachacha.avgspendrate, data=total)
  tot3<-round(predict(tot2,newdata =data.frame( chachacha.totalincome=x1,chachacha.ordinary=x2,chachacha.nonrecurring=x3,chachacha.consumption=x4,
                                                chachacha.entertainment=x5,chachacha.nonconsumption=x6,chachacha.surplus=x7,chachacha.avgspendrate=x8)),digits=0)
  
  return(tot3)
}
