<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:a="nju.edu.cn/schema/a" xmlns:c="nju.edu.cn/schema/c">

    <xsl:template match="/">
        <xsl:element name="a:学生列表" namespace="nju.edu.cn/schema/a">
            <xsl:apply-templates/>
        </xsl:element>
    </xsl:template>

    <xsl:template match="c:学生信息">
        <xsl:element name="a:学生信息">
            <xsl:element name="a:账户名">
                <xsl:value-of select="c:acc"/>
            </xsl:element>
            <xsl:element name="a:密码">
                <xsl:value-of select="c:passwd"/>
            </xsl:element>
            <xsl:element name="a:权限">
                Null
            </xsl:element>
            <xsl:element name="a:学号">
                <xsl:value-of select="c:Sno"/>
            </xsl:element>
            <xsl:element name="a:院系">
                <xsl:value-of select="c:Sde"/>
            </xsl:element>
            <xsl:element name="a:姓名">
                <xsl:value-of select="c:Snm"/>
            </xsl:element>
            <xsl:element name="a:性别">
                <xsl:value-of select="c:Sex"/>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>