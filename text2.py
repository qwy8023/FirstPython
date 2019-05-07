import snownlp
s = snownlp.SnowNLP('这个东西真心很赞')
print('中文分词',s.words)
print('情感分析',s.sentiments)
print('转成拼音',s.pinyin)
print('词频',s.tf)
print('提取三个关键词',s.keywords(3))

