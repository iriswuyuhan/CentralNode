<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:c="nju.edu.cn/schema/c"
                                xmlns:b="nju.edu.cn/schema/b">

    <xsl:template match="/">
        <xsl:element name="b:课程列表" namespace="nju.edu.cn/schema/b">
            <xsl:apply-templates/>
        </xsl:element>
    </xsl:template>

    <xsl:template match="c:课程">
        <xsl:element name="b:课程">
            <xsl:element name="b:编号">
                <xsl:value-of select="c:Cno"/>
            </xsl:element>
            <xsl:element name="b:名称">
                <xsl:value-of select="c:Cnm"/>
            </xsl:element>
            <xsl:element name="b:课时">
                <xsl:value-of select="c:Ctm"/>
            </xsl:element>
            <xsl:element name="b:学分">
                <xsl:value-of select="c:Cpt"/>
            </xsl:element>
            <xsl:element name="b:老师">
                <xsl:value-of select="c:Tec"/>
            </xsl:element>
            <xsl:element name="b:地点">
                <xsl:value-of select="c:Pla"/>
            </xsl:element>
            <xsl:element name="b:共享">
                <xsl:value-of select="c:Share"/>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>