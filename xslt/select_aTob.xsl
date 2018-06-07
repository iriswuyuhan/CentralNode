<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                                xmlns:a="nju.edu.cn/schema/a" xmlns:b="nju.edu.cn/schema/b">

    <xsl:template match="/">
        <xsl:element name="b:选课列表" namespace="nju.edu.cn/schema/b">
            <xsl:apply-templates />
        </xsl:element>
    </xsl:template>

    <xsl:template match="a:选课">
        <xsl:element name="b:选课">
            <xsl:element name="b:开课院系">
                <xsl:value-of select="a:开课院系"/>
            </xsl:element>
            <xsl:element name="b:学号">
                <xsl:value-of select="a:学号"/>
            </xsl:element>
            <xsl:element name="b:编号">
                <xsl:value-of select="a:课程编号"/>
            </xsl:element>
            <xsl:element name="b:得分">
                <xsl:value-of select="a:成绩"/>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>