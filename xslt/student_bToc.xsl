<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:c="nju.edu.cn/schema/c" xmlns:b="nju.edu.cn/schema/b">

    <xsl:template match="/">
        <xsl:element name="c:学生列表" namespace="nju.edu.cn/schema/c">
            <xsl:apply-templates/>
        </xsl:element>
    </xsl:template>

    <xsl:template match="b:学生信息">
        <xsl:element name="c:学生信息">
            <xsl:element name="c:acc">
                <xsl:value-of select="b:账户名"/>
            </xsl:element>
            <xsl:element name="c:passwd">
                <xsl:value-of select="b:密码"/>
            </xsl:element>
            <xsl:element name="c:Sno">
                <xsl:value-of select="b:学号"/>
            </xsl:element>
            <xsl:element name="c:Sdep">
                <xsl:value-of select="b:专业"/>
            </xsl:element>
            <xsl:element name="c:Snm">
                <xsl:value-of select="b:姓名"/>
            </xsl:element>
            <xsl:element name="c:Sex">
                <xsl:value-of select="b:性别"/>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>