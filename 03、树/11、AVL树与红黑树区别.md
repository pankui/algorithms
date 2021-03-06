
## [原文](https://blog.csdn.net/zhangkunrun/article/details/38336543)

## [原文](https://www.zhihu.com/question/19856999/answer/42185147)

# AVL树与红黑树区别

红黑树比 AVL 树具体更高效在旋转次数比AVL少。


## 红黑树与AVL树的比较：

AVL是严格的平衡树，因此在增加或者删除节点的时候，根据不同情况，旋转的次数比红黑树要多；

红黑树是用非严格的平衡来换取增删节点时候旋转次数的降低开销；

所以简单说，如果你的应用中，搜索的次数远远大于插入和删除，那么选择AVL树，

如果搜索，插入删除次数几乎差不多，应选择红黑树。即，有时仅为了排序（建立-遍历-删除），不查找或查找次数很少，R-B树合算一些。



红黑树与AVL树的调整平衡的实现机制不同，AVL靠平衡因子和旋转，
红黑树靠节点颜色以及一些约定再加上旋转。因此，存在去掉颜色的红黑树后它不是AVL树，
比如左子树都是黑的，右子树都是红黑相间的，这样整个树高度2n的时候，根节点的左右层数差可以到n
 