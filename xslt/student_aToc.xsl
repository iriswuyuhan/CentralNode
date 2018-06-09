<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:a="nju.edu.cn/schema/a" xmlns:c="nju.edu.cn/schema/c">

    <xsl:template match="/">
        <xsl:element name="c:学生列表" namespace="nju.edu.cn/schema/c">
            <xsl:apply-templates/>
        </xsl:element>
    </xsl:template>

    <xsl:template match="a:学生信息">
        <xsl:element name="c:学生信息">
            <xsl:element name="c:acc">
                <xsl:value-of select="a:账户名"/>
            </xsl:element>
            <xsl:element name="c:passwd">
                <xsl:value-of select="a:密码"/>
            </xsl:element>
            <xsl:element name="c:Sno">
                <xsl:value-of select="a:学号"/>
            </xsl:element>
            <xsl:element name="c:Sde">
                <xsl:value-of select="a:院系"/>
            </xsl:element>
            <xsl:element name="c:Snm">
                <xsl:value-of select="a:姓名"/>
            </xsl:element>
            <xsl:element name="c:Sex">
                <xsl:value-of select="a:性别"/>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>