<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:c="nju.edu.cn/schema/c">

    <xsl:template match="/">
        <xsl:element name="课程列表">
            <xsl:apply-templates/>
        </xsl:element>
    </xsl:template>

    <xsl:template match="c:课程">
        <xsl:element name="课程">
            <xsl:element name="编号">
                <xsl:value-of select="c:Cno"/>
            </xsl:element>
            <xsl:element name="名称">
                <xsl:value-of select="c:Cnm"/>
            </xsl:element>
            <xsl:element name="课时">
                <xsl:value-of select="c:Ctm"/>
            </xsl:element>
            <xsl:element name="学分">
                <xsl:value-of select="c:Cpt"/>
            </xsl:element>
            <xsl:element name="老师">
                <xsl:value-of select="c:Tec"/>
            </xsl:element>
            <xsl:element name="地点">
                <xsl:value-of select="c:Pla"/>
            </xsl:element>
            <xsl:element name="共享">
                <xsl:value-of select="c:Share"/>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>