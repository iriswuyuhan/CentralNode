<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:c="nju.edu.cn/schema/c" xmlns:b="nju.edu.cn/schema/b">

    <xsl:template match="/">
        <xsl:element name="c:选课列表" namespace="nju.edu.cn/schema/c">
            <xsl:apply-templates />
        </xsl:element>
    </xsl:template>

    <xsl:template match="b:选课">
        <xsl:element name="c:选课">
            <xsl:element name="c:开课院系">
                <xsl:value-of select="b:开课院系"/>
            </xsl:element>
            <xsl:element name="c:Sno">
                <xsl:value-of select="b:学号"/>
            </xsl:element>
            <xsl:element name="c:Cno">
                <xsl:value-of select="b:编号"/>
            </xsl:element>
            <xsl:element name="c:Grd">
                <xsl:value-of select="b:得分"/>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>