## 目录
* [README](#README)

****

README
===========================
java 爬虫，采用webmagic框架。目的爬取百度贴吧的数据，并做一些统计与数据分析，非商业，纯属个人娱乐。近期工作项目有用到爬虫，便开始学习并写了个demo。
采用的是webmagic爬虫框架，爬取的内容有：帖子，帖子回复，用户主页。项目为springboot 1.5.7版本，提供数据持久化，前端采用echart做数据分析图表展示。 
百度贴吧的数据只能爬取到99999页，即不超过10万页，再往后就访问不了了。起初我是想爬取本校贴吧，看看大家都在聊啥，哪年那个帖子最火、词云等等，后来发现，百度贴吧其实风格都一样。
希望这个项目能给初学 java 爬虫的有些帮助，大家也可以把环境搭建起来，爬取自己学校的贴吧。^_^ -

-------------------- 本文来自 miserchen_cy 的CSDN 博客 ，全文地址请点击：https://blog.csdn.net/sinat_22767969/article/details/82953774?utm_source=copy  

****
|Author|陈超允|
|---|---
|E-mail|873692191@qq.com

# 技术栈 

- springboot 1.5.7
- springMVC+Rest+EChart...
- tx.mybatis 3.4.6
- hikari 连接池
- webmagic 0.7.3（修改版，修复https问题与log优化 下载地址：<https://download.csdn.net/download/sinat_22767969/10703880>）
- mysql 5.7.17 （支持utf8mb4字符编码）

## 表设计

- [ ] 用户表 user

- [ ] 用户关注贴吧表 user_tbs

- [ ] 帖子表 post

- [ ] 回帖表 comment

- [ ] 分词表 word_divide


## **计划统计**

### 1. 帖子标题的热点词汇（分析贴吧用户使用最频繁的词汇）
![](https://img-blog.csdn.net/20181006212441788?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

### 2. 发帖与不发帖用户占比（潜水/只回帖用户与常发帖用户占比）
![](https://img-blog.csdn.net/20181007141049293?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 3. 发帖有回复与没回复占比（石沉大海的帖子占比）
![](https://img-blog.csdn.net/20181007141142738?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 4. 年发帖量（分析近5年来发帖量最多的哪年）
![](https://img-blog.csdn.net/20181006213436893?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 5. 年里的月发帖量（分析每年中，大家都喜欢在几月份发帖）
![](https://img-blog.csdn.net/20181006213652111?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 6. 时发帖量（分析大家每天最爱在什么时候发帖）
![](https://img-blog.csdn.net/20181006213925664?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 7. 用户等级分布（分析贴吧用户各等级比例）
![]()
### 8. 年度的十大热帖（按年统计每年讨论最热的帖子）
![](https://img-blog.csdn.net/20181006214114531?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 9. 十大活跃用户，按年分组（所谓的贴吧达人/大神）
![](https://img-blog.csdn.net/20181006214418228?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 10. 粉丝最多的10大用户（吧里人气最高的明星）
![](https://img-blog.csdn.net/20181006224326695?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 11. 大家最喜欢关注的贴吧-词云（分析大家都喜欢关注哪些贴吧）
![](https://img-blog.csdn.net/20181006224553279?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 12. 男女比例分布（吧里的男女用户比例，到底是？）
![](https://img-blog.csdn.net/201810071411210?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 13. 吧龄分布（大家贴吧的吧龄比例）
![]()
### 14. 十大发帖量最多的用户（看看哪些人最爱在贴吧发帖了）
![](https://img-blog.csdn.net/20181006224705738?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 15. 帖子回复的词云（看所有帖子下大家都在说些什么）
![](https://img-blog.csdn.net/20181006224754103?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 16. 贴吧名词云（大家最喜欢用什么词起名）
![](https://img-blog.csdn.net/20181006224944943?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 17. 收到礼物最多的十大用户（最受欢迎的吧友到底是谁？）
![]()
### 18. 用户的头像大集合（一页展示所有用户的头像，并做图像分析出“平均头像”长啥样）
![]()
### 19. 用户设备分布（到底是苹果用户多，还是安卓用户？）
![](https://img-blog.csdn.net/20181007141242823?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpbmF0XzIyNzY3OTY5/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

# 数据分析/效果展示

- ## 见博客：https://blog.csdn.net/sinat_22767969/article/details/82953774
