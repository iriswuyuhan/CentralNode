<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:a="nju.edu.cn/schema/a" xmlns:b="nju.edu.cn/schema/b">

    <xsl:template match="/">
        <xsl:element name="b:学生信息" namespace="nju.edu.cn/schema/b">
            <xsl:apply-templates/>
        </xsl:element>
    </xsl:template>

    <xsl:template match="a:学生信息">
        <xsl:element name="b:账户名">
            <xsl:value-of select="a:账户名"/>
        </xsl:element>
        <xsl:element name="b:密码">
            <xsl:value-of select="a:密码"/>
        </xsl:element>
        <xsl:element name="b:级别">
            <xsl:value-of select="a:权限"/>
        </xsl:element>
        <xsl:element name="b:学号">
            <xsl:value-of select="a:学号"/>
        </xsl:element>
        <xsl:element name="b:专业">
            <xsl:value-of select="a:院系"/>
        </xsl:element>
        <xsl:element name="b:姓名">
            <xsl:value-of select="a:姓名"/>
        </xsl:element>
        <xsl:element name="b:性别">
            <xsl:value-of select="a:性别"/>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>