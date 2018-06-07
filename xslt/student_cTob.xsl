<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:c="nju.edu.cn/schema/c" xmlns:b="nju.edu.cn/schema/b">

    <xsl:template match="/">
        <xsl:element name="b:学生信息" namespace="nju.edu.cn/schema/b">
            <xsl:apply-templates/>
        </xsl:element>
    </xsl:template>

    <xsl:template match="c:学生信息">
        <xsl:element name="b:账户名">
            <xsl:value-of select="c:acc"/>
        </xsl:element>
        <xsl:element name="b:密码">
            <xsl:value-of select="c:passwd"/>
        </xsl:element>
        <xsl:element name="b:级别">
            Null
        </xsl:element>
        <xsl:element name="b:学号">
            <xsl:value-of select="c:Sno"/>
        </xsl:element>
        <xsl:element name="b:专业">
            <xsl:value-of select="c:Sde"/>
        </xsl:element>
        <xsl:element name="b:姓名">
            <xsl:value-of select="c:Snm"/>
        </xsl:element>
        <xsl:element name="b:性别">
            <xsl:value-of select="c:Sex"/>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>