<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:c="nju.edu.cn/schema/c" xmlns:b="nju.edu.cn/schema/b">

    <xsl:template match="/">
        <xsl:element name="b:选课列表" namespace="nju.edu.cn/schema/b">
            <xsl:apply-templates />
        </xsl:element>
    </xsl:template>

    <xsl:template match="c:选课">
        <xsl:element name="b:选课">
            <xsl:element name="b:开课院系">
                <xsl:value-of select="c:开课院系"/>
            </xsl:element>
            <xsl:element name="b:学号">
                <xsl:value-of select="c:Sno"/>
            </xsl:element>
            <xsl:element name="b:编号">
                <xsl:value-of select="c:Cno"/>
            </xsl:element>
            <xsl:element name="b:得分">
                <xsl:value-of select="c:Grd"/>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>